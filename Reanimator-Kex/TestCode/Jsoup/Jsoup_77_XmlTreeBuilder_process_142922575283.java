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

public class XmlTreeBuilder_process_142922575283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441483;
     Object term441547;

    public XmlTreeBuilder_process_142922575283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441483 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term442341 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term442340 = ((Class) term442341).getDeclaredField((String) "Doctype");
        ((Field) term442340).setAccessible(true);
        Object enum264 = ((Field) term442340).get((Object) null);
        term441547 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term441547, term441547.getClass(), "type", enum264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term441547;
        try {
            callMethod(klass, "process", argTypes, term441483, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


