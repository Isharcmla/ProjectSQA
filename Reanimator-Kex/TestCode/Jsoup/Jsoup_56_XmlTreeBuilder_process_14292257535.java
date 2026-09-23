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

public class XmlTreeBuilder_process_14292257535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71031;
     Object term71097;

    public XmlTreeBuilder_process_14292257535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71031 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term71662 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term71661 = ((Class) term71662).getDeclaredField((String) "Doctype");
        ((Field) term71661).setAccessible(true);
        Object enum195 = ((Field) term71661).get((Object) null);
        term71097 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term71097, term71097.getClass(), "type", enum195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term71097;
        try {
            callMethod(klass, "process", argTypes, term71031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


