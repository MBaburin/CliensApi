package com.example.tt.controller;

import com.example.tt.entity.ClientEntity;
import com.example.tt.exeptions.ClientAlreadyExistException;
import com.example.tt.exeptions.ClientNotFoundException;
import com.example.tt.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @PostMapping("/add")
    public ResponseEntity addClient(@RequestBody ClientEntity client){
        try {
            clientService.addClient(client);
            return ResponseEntity.ok("Пользователь успешно сохранён");
        } catch (ClientAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }

        @GetMapping("/check")
    public ResponseEntity checkClients(@RequestParam Long id){
        try {
            return ResponseEntity.ok(clientService.getClient(id));
        } catch (ClientNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }

   @DeleteMapping("/{id}")
   public ResponseEntity deleteClients(@PathVariable Long id){
       try {
           return ResponseEntity.ok(clientService.deleteClient(id));
       } catch (Exception e){
           return ResponseEntity.badRequest().body("Неизвестная ошибка");
       }
   }

    @PutMapping ("/edit")
    public ResponseEntity editClient(@RequestBody ClientEntity client){
        try {
            clientService.editClient(client);
            return ResponseEntity.ok("Пользователь успешно изменён");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }

}
