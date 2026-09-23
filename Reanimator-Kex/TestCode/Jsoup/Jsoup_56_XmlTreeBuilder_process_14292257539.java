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

public class XmlTreeBuilder_process_14292257539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73963;
     Object term74033;

    public XmlTreeBuilder_process_14292257539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73963 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term74832 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term74831 = ((Class) term74832).getDeclaredField((String) "Doctype");
        ((Field) term74831).setAccessible(true);
        Object enum200 = ((Field) term74831).get((Object) null);
        term74033 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term74033, term74033.getClass(), "type", enum200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term74033;
        try {
            callMethod(klass, "process", argTypes, term73963, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


