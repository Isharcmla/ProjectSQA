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

public class NullPropertyPointer_escape_119373006875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10907;
     Object term10981;

    public NullPropertyPointer_escape_119373006875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10907 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        term10981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term10981, term10981.getClass(), "propertyName", null);
        setBooleanField(term10981, term10981.getClass(), "byNameAttribute", false);
        setIntField(term10981, term10981.getClass(), "propertyIndex", 0);
        setField(term10981, term10981.getClass(), "bean", null);
        setField(term10981, term10981.getClass(), "value", null);
        setIntField(term10981, term10981.getClass(), "index", 0);
        setBooleanField(term10981, term10981.getClass(), "attribute", false);
        setField(term10981, term10981.getClass(), "rootNode", null);
        setField(term10981, term10981.getClass(), "namespaceResolver", null);
        setField(term10981, term10981.getClass(), "parent", null);
        setField(term10981, term10981.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term10907, args);
        assertTrue(recursiveEquals(term10907, term10981));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


