package com.fejqueiroz.demo;

import com.fejqueiroz.demo.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.awt.*;


@RestController
@RequestMapping ("/usuario")

public class GreetingController {

    public class GreetingController{

        private ProductoService service;

        @GetMapping
        public List<Usuario> usuarioList(){
            return service.usuarioList();
        }
        @GetMapping("/{nome}")
        public nome buscarPorId(@PathVariable String nome){
            return service.buscarPorId(nome);
        }
       @PostMapping
    public usuario salvar(@RequestBody Usuario usuario){
            return service.salvar(usuario);
    }

    }
@PutMapping
    public Usuario alterar(@RequestBody Usuario usuario){
        return service.salvar(usuario);

    }

@DeleteMapping("/{nome}")
    public void delete(@PathVariable String nome)
    service.delete(nome);

}
