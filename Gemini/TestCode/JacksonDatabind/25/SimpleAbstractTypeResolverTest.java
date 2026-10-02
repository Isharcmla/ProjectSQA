package com.fasterxml.jackson.databind.module;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SimpleAbstractTypeResolverTest {

    private SimpleAbstractTypeResolver resolver;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        resolver = new SimpleAbstractTypeResolver();
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testAddMapping_sameClass_throwsIllegalArgumentException() {
        try {
            resolver.addMapping(List.class, List.class);
            fail("Expected IllegalArgumentException when mapping class to itself");
        } catch (IllegalArgumentException e) {
            assertEquals("Can not add mapping from class to itself", e.getMessage());
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test
    public void testAddMapping_notSubtype_throwsIllegalArgumentException() {
        Class superType = CharSequence.class;
        Class notSubType = Integer.class;
        try {
            resolver.addMapping(superType, notSubType);
            fail("Expected IllegalArgumentException when target is not a subtype");
        } catch (IllegalArgumentException e) {
            assertEquals("Can not add mapping from class " + superType.getName()
                    + " to " + notSubType.getName() + ", as latter is not a subtype of former", e.getMessage());
        }
    }

    @Test
    public void testAddMapping_concreteSuperClass_throwsIllegalArgumentException() {
        try {
            resolver.addMapping(ArrayList.class, SubArrayList.class);
            fail("Expected IllegalArgumentException when superType is not abstract");
        } catch (IllegalArgumentException e) {
            assertEquals("Can not add mapping from class " + ArrayList.class.getName()
                    + " since it is not abstract", e.getMessage());
        }
    }

    @Test
    public void testAddMapping_validAbstractClassAndInterface_returnsResolverInstance() {
        SimpleAbstractTypeResolver result1 = resolver.addMapping(List.class, LinkedList.class);
        assertSame(resolver, result1);

        SimpleAbstractTypeResolver result2 = resolver.addMapping(AbstractList.class, ArrayList.class);
        assertSame(resolver, result2);
    }

    @Test
    public void testFindTypeMapping_unmappedType_returnsNull() {
        JavaType mapType = typeFactory.constructType(Map.class);
        JavaType mapped = resolver.findTypeMapping(null, mapType);
        assertNull(mapped);
    }

    @Test
    public void testFindTypeMapping_mappedType_returnsNarrowedJavaType() {
        resolver.addMapping(Collection.class, LinkedList.class);

        JavaType collectionType = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType mapped = resolver.findTypeMapping(null, collectionType);

        assertNotNull(mapped);
        assertEquals(LinkedList.class, mapped.getRawClass());
        assertEquals(String.class, mapped.getContentType().getRawClass());
    }

    @Test
    public void testResolveAbstractType_alwaysReturnsNull() {
        JavaType listType = typeFactory.constructType(List.class);
        assertNull(resolver.resolveAbstractType(null, listType));

        resolver.addMapping(List.class, LinkedList.class);
        assertNull(resolver.resolveAbstractType(null, listType));
    }

    @Test
    public void testSerialization_preservesMappings() throws Exception {
        resolver.addMapping(List.class, LinkedList.class);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(resolver);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimpleAbstractTypeResolver deserialized = (SimpleAbstractTypeResolver) ois.readObject();
        ois.close();

        JavaType listType = typeFactory.constructType(List.class);
        JavaType mapped = deserialized.findTypeMapping(null, listType);

        assertNotNull(mapped);
        assertEquals(LinkedList.class, mapped.getRawClass());
    }

    private static class SubArrayList<T> extends ArrayList<T> {
        private static final long serialVersionUID = 1L;
    }
}
