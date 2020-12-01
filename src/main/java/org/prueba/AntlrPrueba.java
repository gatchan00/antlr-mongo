package org.prueba;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrPrueba {

	public static void main(String[] args) {
		
		String ejemplo = "[Document{{$match=Document{{$and=[Document{{idPnODH=16511183}}]}}}}, Document{{$project=Document{{camposBusqueda=0, personaPredominante=0}}}}, Document{{$addFields=Document{{_id=Document{{$toString=$_id}}}}}}]\r\n";
		
		//construimos el Lexer
		MongoLexer mongoLexer = new MongoLexer(CharStreams.fromString(ejemplo));
		
		//Construimos el parser
		CommonTokenStream tokens = new CommonTokenStream(mongoLexer);
		MongoParser parser = new MongoParser(tokens);
		
		//Cogemos el nodo raíz del árbol
		ParseTree tree = parser.rootMongo();
		
		//Creamos el listener 
		AntlrPruebaListener listener = new AntlrPruebaListener();
		
		//y pedimos al walker que lo recorra
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, tree);
		
		
	}

}
