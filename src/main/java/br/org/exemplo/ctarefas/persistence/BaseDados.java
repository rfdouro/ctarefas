/**/
package br.org.exemplo.ctarefas.persistence;

import br.org.exemplo.ctarefas.model.Tarefa;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

/**
 * @author rfdouro
 */
public final class BaseDados {

 public static ObjectRepository<Tarefa> RTarefa;

 static {
  Nitrite db = Nitrite.builder()
          .compressed()
          .filePath("baseDados.db")
          .openOrCreate("root", "secret");
  
  RTarefa = db.getRepository(Tarefa.class);
 }
}
