package org.jsoup.parser;

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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_process_14292257557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81383;
     Object term81449;

    public XmlTreeBuilder_process_14292257557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81383 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term82314 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term82313 = ((Class) term82314).getDeclaredField((String) "Character");
        ((Field) term82313).setAccessible(true);
        Object enum176 = ((Field) term82313).get((Object) null);
        StringBuilder term81617 = new StringBuilder();
        term81449 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term81449, term81449.getClass(), "type", enum176);
        setField(term81449, term81449.getClass(), "name", term81617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term81449;
        try {
            callMethod(klass, "process", argTypes, term81383, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


