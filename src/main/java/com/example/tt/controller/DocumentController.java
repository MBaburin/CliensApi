package com.example.tt.controller;

import com.example.tt.entity.DocumentEntity;
import com.example.tt.exeptions.DocumentAlreadyExistException;
import com.example.tt.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/add")
    public ResponseEntity createDocument(@RequestBody DocumentEntity document,
                                         @RequestParam Long clientId,
                                         @RequestParam Long typeId){
        try {
            documentService.createDocument(document, clientId, typeId);
            return ResponseEntity.ok("Документ успешно сохранён");
        } catch (DocumentAlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDocument(@PathVariable long id){
        try {
            return ResponseEntity.ok(documentService.deleteDocument(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Неизвестная ошибка");
        }
    }




}
