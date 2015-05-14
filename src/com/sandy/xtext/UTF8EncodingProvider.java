package com.sandy.xtext;

import org.eclipse.emf.common.util.URI ;
import org.eclipse.xtext.parser.IEncodingProvider ;

public class UTF8EncodingProvider implements IEncodingProvider {

    public String getEncoding( URI uri ) {
        return "UTF-8" ;
    }
}
