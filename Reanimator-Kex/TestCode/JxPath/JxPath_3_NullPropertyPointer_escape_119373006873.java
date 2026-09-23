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

public class NullPropertyPointer_escape_119373006873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10590;
     Object term10957;

    public NullPropertyPointer_escape_119373006873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        term10957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term10957, term10957.getClass(), "propertyName", null);
        setBooleanField(term10957, term10957.getClass(), "byNameAttribute", false);
        setIntField(term10957, term10957.getClass(), "propertyIndex", 0);
        setField(term10957, term10957.getClass(), "bean", null);
        setField(term10957, term10957.getClass(), "value", null);
        setIntField(term10957, term10957.getClass(), "index", 0);
        setBooleanField(term10957, term10957.getClass(), "attribute", false);
        setField(term10957, term10957.getClass(), "rootNode", null);
        setField(term10957, term10957.getClass(), "namespaceResolver", null);
        setField(term10957, term10957.getClass(), "parent", null);
        setField(term10957, term10957.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term10590, args);
        assertTrue(recursiveEquals(term10590, term10957));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


