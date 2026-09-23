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

public class XmlTreeBuilder_process_142922575189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267872;
     Object term267938;

    public XmlTreeBuilder_process_142922575189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267872 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term267872, term267872.getClass(), "settings", null);
        Class<? extends Object> term268788 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term268787 = ((Class) term268788).getDeclaredField((String) "EndTag");
        ((Field) term268787).setAccessible(true);
        Object enum294 = ((Field) term268787).get((Object) null);
        StringBuilder term268106 = new StringBuilder();
        term267938 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term267938, term267938.getClass(), "type", enum294);
        setField(term267938, term267938.getClass(), "name", term268106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term267938;
        try {
            callMethod(klass, "process", argTypes, term267872, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


