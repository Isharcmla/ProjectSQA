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

public class XmlTreeBuilder_process_142922575315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457299;
     Object term457361;

    public XmlTreeBuilder_process_142922575315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457299 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term458153 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term458152 = ((Class) term458153).getDeclaredField((String) "Doctype");
        ((Field) term458152).setAccessible(true);
        Object enum266 = ((Field) term458152).get((Object) null);
        term457361 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term457361, term457361.getClass(), "type", enum266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term457361;
        try {
            callMethod(klass, "process", argTypes, term457299, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


