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

public class XmlTreeBuilder_process_142922575249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306831;
     Object term306901;

    public XmlTreeBuilder_process_142922575249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306831 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term307705 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term307704 = ((Class) term307705).getDeclaredField((String) "StartTag");
        ((Field) term307704).setAccessible(true);
        Object enum252 = ((Field) term307704).get((Object) null);
        term306901 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term306901, term306901.getClass(), "type", enum252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term306901;
        try {
            callMethod(klass, "process", argTypes, term306831, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


