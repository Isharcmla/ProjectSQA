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

public class XmlTreeBuilder_process_142922575247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379088;
     Object term379154;

    public XmlTreeBuilder_process_142922575247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379088 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term379088, term379088.getClass(), "settings", null);
        Class<? extends Object> term380003 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term380002 = ((Class) term380003).getDeclaredField((String) "EndTag");
        ((Field) term380002).setAccessible(true);
        Object enum255 = ((Field) term380002).get((Object) null);
        StringBuilder term379322 = new StringBuilder();
        term379154 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term379154, term379154.getClass(), "type", enum255);
        setField(term379154, term379154.getClass(), "name", term379322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term379154;
        try {
            callMethod(klass, "process", argTypes, term379088, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


