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

public class XmlTreeBuilder_process_142922575261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314057;
     Object term314121;

    public XmlTreeBuilder_process_142922575261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314057 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term314914 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term314913 = ((Class) term314914).getDeclaredField((String) "Doctype");
        ((Field) term314913).setAccessible(true);
        Object enum254 = ((Field) term314913).get((Object) null);
        term314121 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term314121, term314121.getClass(), "type", enum254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term314121;
        try {
            callMethod(klass, "process", argTypes, term314057, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


