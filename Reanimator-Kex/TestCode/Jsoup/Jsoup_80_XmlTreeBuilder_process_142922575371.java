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

public class XmlTreeBuilder_process_142922575371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363144;
     Object term363210;

    public XmlTreeBuilder_process_142922575371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363144 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term363777 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term363776 = ((Class) term363777).getDeclaredField((String) "Doctype");
        ((Field) term363776).setAccessible(true);
        Object enum264 = ((Field) term363776).get((Object) null);
        term363210 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term363210, term363210.getClass(), "type", enum264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term363210;
        try {
            callMethod(klass, "process", argTypes, term363144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


