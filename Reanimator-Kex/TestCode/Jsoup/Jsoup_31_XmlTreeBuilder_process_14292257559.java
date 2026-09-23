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

public class XmlTreeBuilder_process_14292257559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56346;
     Object term56414;

    public XmlTreeBuilder_process_14292257559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56346 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term57641 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term57640 = ((Class) term57641).getDeclaredField((String) "Doctype");
        ((Field) term57640).setAccessible(true);
        Object enum110 = ((Field) term57640).get((Object) null);
        term56414 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term56414, term56414.getClass(), "type", enum110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term56414;
        try {
            callMethod(klass, "process", argTypes, term56346, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


