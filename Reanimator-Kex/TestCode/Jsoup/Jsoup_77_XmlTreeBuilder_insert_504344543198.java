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

public class XmlTreeBuilder_insert_504344543198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330740;
     Object term330872;

    public XmlTreeBuilder_insert_504344543198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330740 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term330806 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term330806, term330806.getClass(), "preserveTagCase", true);
        setField(term330740, term330740.getClass(), "settings", term330806);
        StringBuilder term330932 = new StringBuilder();
        char[] term330394 = (char[]) newCharArray(4);
        StringBuilder term330992 = new StringBuilder();
        ((StringBuilder) term330992).append(term330394);
        StringBuilder term331052 = new StringBuilder();
        term330872 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term330872, term330872.getClass(), "name", term330932);
        setField(term330872, term330872.getClass(), "publicIdentifier", term330992);
        setField(term330872, term330872.getClass(), "systemIdentifier", term331052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term330872;
        try {
            callMethod(klass, "insert", argTypes, term330740, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


