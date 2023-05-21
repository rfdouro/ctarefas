/**/
package br.org.exemplo.ctarefas.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

/**
 * @author rfdouro
 */
public class Tarefa {

 @Id
 private NitriteId id;
 private String descricao;
 private String data;

 public NitriteId getId() {
  return id;
 }

 public void setId(NitriteId id) {
  this.id = id;
 }

 public String getDescricao() {
  return descricao;
 }

 public void setDescricao(String descricao) {
  this.descricao = descricao;
 }

 public LocalDate getData() {
  return LocalDate.parse(this.data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 }

 public void setData(String data) {
  this.data = data;
 }

 @Override
 public String toString() {
  return "Tarefa{" + "id=" + id + ", descricao=" + descricao + ", data=" + data + '}';
 }

}
