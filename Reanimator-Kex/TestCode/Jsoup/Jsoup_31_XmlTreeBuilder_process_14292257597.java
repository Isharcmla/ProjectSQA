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

public class XmlTreeBuilder_process_14292257597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81483;
     Object term81549;

    public XmlTreeBuilder_process_14292257597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81483 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term82116 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term82115 = ((Class) term82116).getDeclaredField((String) "Doctype");
        ((Field) term82115).setAccessible(true);
        Object enum135 = ((Field) term82115).get((Object) null);
        term81549 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term81549, term81549.getClass(), "type", enum135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term81549;
        try {
            callMethod(klass, "process", argTypes, term81483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


