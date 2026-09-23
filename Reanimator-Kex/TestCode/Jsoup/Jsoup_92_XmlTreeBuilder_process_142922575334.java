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

public class XmlTreeBuilder_process_142922575334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331917;
     Object term331987;

    public XmlTreeBuilder_process_142922575334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331917 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term335561 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term335560 = ((Class) term335561).getDeclaredField((String) "StartTag");
        ((Field) term335560).setAccessible(true);
        Object enum313 = ((Field) term335560).get((Object) null);
        term331987 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term331987, term331987.getClass(), "type", enum313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term331987;
        try {
            callMethod(klass, "process", argTypes, term331917, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


