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
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418932;
     Object term419064;

    public XmlTreeBuilder_insert_504344543263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418932 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term418998 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term418998, term418998.getClass(), "preserveTagCase", true);
        setField(term418932, term418932.getClass(), "settings", term418998);
        char[] term418531 = (char[]) newCharArray(0);
        StringBuilder term419124 = new StringBuilder();
        ((StringBuilder) term419124).append(term418531);
        StringBuilder term419184 = new StringBuilder();
        StringBuilder term419244 = new StringBuilder();
        term419064 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term419064, term419064.getClass(), "name", term419124);
        setField(term419064, term419064.getClass(), "publicIdentifier", term419184);
        setField(term419064, term419064.getClass(), "systemIdentifier", term419244);
        setField(term419064, term419064.getClass(), "pubSysKey", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term419064;
        try {
            callMethod(klass, "insert", argTypes, term418932, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


