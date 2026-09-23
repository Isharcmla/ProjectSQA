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

public class XmlTreeBuilder_process_14292257579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69468;
     Object term69534;

    public XmlTreeBuilder_process_14292257579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69468 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term70399 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term70398 = ((Class) term70399).getDeclaredField((String) "Character");
        ((Field) term70398).setAccessible(true);
        Object enum121 = ((Field) term70398).get((Object) null);
        StringBuilder term69702 = new StringBuilder();
        term69534 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term69534, term69534.getClass(), "type", enum121);
        setField(term69534, term69534.getClass(), "name", term69702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term69534;
        try {
            callMethod(klass, "process", argTypes, term69468, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


