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

public class XmlTreeBuilder_process_14292257589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211880;
     Object term211944;

    public XmlTreeBuilder_process_14292257589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211880 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term213784 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213783 = ((Class) term213784).getDeclaredField((String) "Doctype");
        ((Field) term213783).setAccessible(true);
        Object enum241 = ((Field) term213783).get((Object) null);
        term211944 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term211944, term211944.getClass(), "type", enum241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term211944;
        try {
            callMethod(klass, "process", argTypes, term211880, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


