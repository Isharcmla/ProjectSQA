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

public class XmlTreeBuilder_process_142922575441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375636;
     Object term375698;

    public XmlTreeBuilder_process_142922575441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375636 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term376573 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term376572 = ((Class) term376573).getDeclaredField((String) "Doctype");
        ((Field) term376572).setAccessible(true);
        Object enum319 = ((Field) term376572).get((Object) null);
        term375698 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term375698, term375698.getClass(), "type", enum319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term375698;
        try {
            callMethod(klass, "process", argTypes, term375636, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


