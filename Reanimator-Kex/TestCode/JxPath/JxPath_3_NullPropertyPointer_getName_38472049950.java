package org.apache.commons.jxpath.ri.model.beans;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;

public class NullPropertyPointer_getName_38472049950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5509;
     Object term5701;
     Object term5689;

    public NullPropertyPointer_getName_38472049950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5509 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term5509, term5509.getClass(), "propertyName", "");
        term5701 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term5701, term5701.getClass(), "propertyName", "");
        setBooleanField(term5701, term5701.getClass(), "byNameAttribute", false);
        setIntField(term5701, term5701.getClass(), "propertyIndex", 0);
        setField(term5701, term5701.getClass(), "bean", null);
        setField(term5701, term5701.getClass(), "value", null);
        setIntField(term5701, term5701.getClass(), "index", 0);
        setBooleanField(term5701, term5701.getClass(), "attribute", false);
        setField(term5701, term5701.getClass(), "rootNode", null);
        setField(term5701, term5701.getClass(), "namespaceResolver", null);
        setField(term5701, term5701.getClass(), "parent", null);
        setField(term5701, term5701.getClass(), "locale", null);
        term5689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5689, term5689.getClass(), "prefix", null);
        setField(term5689, term5689.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term5509, args);
        assertTrue(recursiveEquals(term5509, term5701));
        assertTrue(recursiveEquals(retValue, term5689));
    }

};


