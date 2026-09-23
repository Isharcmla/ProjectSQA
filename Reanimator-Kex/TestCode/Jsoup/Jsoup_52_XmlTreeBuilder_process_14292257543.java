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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65548;
     Object term65614;

    public XmlTreeBuilder_process_14292257543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65548 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term66179 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term66178 = ((Class) term66179).getDeclaredField((String) "Doctype");
        ((Field) term66178).setAccessible(true);
        Object enum168 = ((Field) term66178).get((Object) null);
        term65614 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term65614, term65614.getClass(), "type", enum168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term65614;
        try {
            callMethod(klass, "process", argTypes, term65548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


