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

public class XmlTreeBuilder_insert_504344543209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351926;
     Object term352058;

    public XmlTreeBuilder_insert_504344543209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351926 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term351992 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term351992, term351992.getClass(), "preserveTagCase", true);
        setField(term351926, term351926.getClass(), "settings", term351992);
        StringBuilder term352118 = new StringBuilder();
        char[] term351555 = (char[]) newCharArray(0);
        StringBuilder term352178 = new StringBuilder();
        ((StringBuilder) term352178).append(term351555);
        term352058 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term352058, term352058.getClass(), "name", term352118);
        setField(term352058, term352058.getClass(), "publicIdentifier", term352118);
        setField(term352058, term352058.getClass(), "systemIdentifier", term352178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term352058;
        try {
            callMethod(klass, "insert", argTypes, term351926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


