package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DocumentType_outerHtmlHead_47202439933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16083;
     Object term16123;
     Object term16207;

    public DocumentType_outerHtmlHead_47202439933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16083 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term16123 = newInstance(Class.forName("java.io.Console$3"));
        Class<? extends Object> term17735 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term17734 = ((Class) term17735).getDeclaredField((String) "xml");
        ((Field) term17734).setAccessible(true);
        Object enum28 = ((Field) term17734).get((Object) null);
        term16207 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term16207, term16207.getClass(), "syntax", enum28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term16123;
        args[1] = 0;
        args[2] = term16207;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term16083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


