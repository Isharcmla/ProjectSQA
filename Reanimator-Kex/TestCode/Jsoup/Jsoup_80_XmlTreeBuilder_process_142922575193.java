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

public class XmlTreeBuilder_process_142922575193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269620;
     Object term269686;

    public XmlTreeBuilder_process_142922575193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269620 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term269620, term269620.getClass(), "settings", null);
        Class<? extends Object> term270536 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term270535 = ((Class) term270536).getDeclaredField((String) "EndTag");
        ((Field) term270535).setAccessible(true);
        Object enum250 = ((Field) term270535).get((Object) null);
        StringBuilder term269854 = new StringBuilder();
        term269686 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term269686, term269686.getClass(), "type", enum250);
        setField(term269686, term269686.getClass(), "name", term269854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term269686;
        try {
            callMethod(klass, "process", argTypes, term269620, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


