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

public class XmlTreeBuilder_process_142922575123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139761;
     Object term139829;

    public XmlTreeBuilder_process_142922575123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139761 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term140626 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term140625 = ((Class) term140626).getDeclaredField((String) "Doctype");
        ((Field) term140625).setAccessible(true);
        Object enum210 = ((Field) term140625).get((Object) null);
        term139829 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term139829, term139829.getClass(), "type", enum210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term139829;
        try {
            callMethod(klass, "process", argTypes, term139761, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


