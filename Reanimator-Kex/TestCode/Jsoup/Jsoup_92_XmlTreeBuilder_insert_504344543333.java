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

public class XmlTreeBuilder_insert_504344543333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331028;
     Object term331160;

    public XmlTreeBuilder_insert_504344543333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331028 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term331094 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term331094, term331094.getClass(), "preserveTagCase", false);
        setField(term331028, term331028.getClass(), "settings", term331094);
        StringBuilder term331220 = new StringBuilder();
        char[] term330855 = (char[]) newCharArray(1);
        setCharElement(term330855, 0, (char) 1);
        StringBuilder term331280 = new StringBuilder();
        ((StringBuilder) term331280).append(term330855);
        StringBuilder term331340 = new StringBuilder();
        term331160 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term331160, term331160.getClass(), "name", term331220);
        setField(term331160, term331160.getClass(), "publicIdentifier", term331280);
        setField(term331160, term331160.getClass(), "systemIdentifier", term331340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term331160;
        try {
            callMethod(klass, "insert", argTypes, term331028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


