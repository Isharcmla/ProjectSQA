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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;

public class DocumentType_outerHtmlHead_47202439932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15143;
     Object term15449;

    public DocumentType_outerHtmlHead_47202439932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15261 = new LinkedHashMap();
        term15143 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term15201 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15201, term15201.getClass(), "attributes", term15261);
        setField(term15143, term15143.getClass(), "attributes", term15201);
        Class<? extends Object> term16944 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term16943 = ((Class) term16944).getDeclaredField((String) "html");
        ((Field) term16943).setAccessible(true);
        Object enum26 = ((Field) term16943).get((Object) null);
        term15449 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term15449, term15449.getClass(), "syntax", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = term15449;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term15143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


