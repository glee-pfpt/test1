package com.proofpoint.glee;

import java.util.Collection; 
 
import org.apache.commons.collections.CollectionUtils; 
import org.apache.commons.collections.Transformer; 
import org.apache.commons.collections.functors.InvokerTransformer; 
 
//import com.abiquo.abiserver.pojo.IPojo; 
 
/**
 * Utility class to manipulate {@link IPojoHB} and {@link IPojo} objects. 
 *  
 * @author ibarrera 
 */ 
public class App 
{ 
//    @SuppressWarnings("unchecked") 
//    public static Collection< ? extends IPojo> allToPojo(final Collection< ? extends IPojoHB> source) 
	public static void abc ()
    { 
        Transformer transformer = InvokerTransformer.getInstance("toPojo"); 
//        return CollectionUtils.collect(source, transformer); 
    } 
 
//    @SuppressWarnings("unchecked") 
//    public static Collection< ? extends IPojoHB> allToPojoHB( 
//        final Collection< ? extends IPojo> source) 
//    { 
//        Transformer transformer = InvokerTransformer.getInstance("toPojoHB"); 
//        return CollectionUtils.collect(source, transformer); 
//    } 
}

