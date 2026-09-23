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

public class DocumentType_outerHtmlHead_47202439925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11469;
     Object term11511;
     Object term11595;

    public DocumentType_outerHtmlHead_47202439925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11469 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term11511 = newInstance(Class.forName("java.io.FileWriter"));
        Class<? extends Object> term12245 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term12244 = ((Class) term12245).getDeclaredField((String) "xml");
        ((Field) term12244).setAccessible(true);
        Object enum19 = ((Field) term12244).get((Object) null);
        term11595 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term11595, term11595.getClass(), "syntax", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term11511;
        args[1] = 0;
        args[2] = term11595;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term11469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


