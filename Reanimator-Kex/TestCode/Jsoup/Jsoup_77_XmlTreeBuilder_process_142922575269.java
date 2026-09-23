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

public class XmlTreeBuilder_process_142922575269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426738;
     Object term426802;

    public XmlTreeBuilder_process_142922575269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426738 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term427594 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term427593 = ((Class) term427594).getDeclaredField((String) "Doctype");
        ((Field) term427593).setAccessible(true);
        Object enum257 = ((Field) term427593).get((Object) null);
        term426802 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term426802, term426802.getClass(), "type", enum257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term426802;
        try {
            callMethod(klass, "process", argTypes, term426738, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


