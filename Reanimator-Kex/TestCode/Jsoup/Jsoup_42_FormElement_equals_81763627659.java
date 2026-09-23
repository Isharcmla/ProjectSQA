package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FormElement_equals_81763627659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32560;
     Object enum1;
     Object term33067;
     Object enum2;

    public FormElement_equals_81763627659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32560 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Class<? extends Object> term33072 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term33071 = ((Class) term33072).getDeclaredField((String) "OWNER_READ");
        ((Field) term33071).setAccessible(true);
        enum1 = ((Field) term33071).get((Object) null);
        term33067 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term33067, term33067.getClass(), "elements", null);
        setField(term33067, term33067.getClass(), "tag", null);
        setField(term33067, term33067.getClass(), "parentNode", null);
        setField(term33067, term33067.getClass(), "childNodes", null);
        setField(term33067, term33067.getClass(), "attributes", null);
        setField(term33067, term33067.getClass(), "baseUri", null);
        setIntField(term33067, term33067.getClass(), "siblingIndex", 0);
        Class<? extends Object> term33324 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term33323 = ((Class) term33324).getDeclaredField((String) "OWNER_READ");
        ((Field) term33323).setAccessible(true);
        enum2 = ((Field) term33323).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "equals", argTypes, term32560, args);
        assertTrue(recursiveEquals(term32560, term33067));
        assertTrue(recursiveEquals(enum1, enum2));
    }

};


