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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_778206878155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268842;
     Object term268964;
     Object term269363;
     Object term269366;

    public Attribute_shouldCollapseAttribute_778206878155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268842 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term268842, term268842.getClass(), "key", "xml");
        setField(term268842, term268842.getClass(), "val", null);
        Class<? extends Object> term269374 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term269373 = ((Class) term269374).getDeclaredField((String) "xml");
        ((Field) term269373).setAccessible(true);
        Object enum55 = ((Field) term269373).get((Object) null);
        term268964 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term268964, term268964.getClass(), "syntax", enum55);
        term269363 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term269363, term269363.getClass(), "key", "xml");
        setField(term269363, term269363.getClass(), "val", null);
        setField(term269363, term269363.getClass(), "parent", null);
        Class<? extends Object> term269623 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term269622 = ((Class) term269623).getDeclaredField((String) "xml");
        ((Field) term269622).setAccessible(true);
        Object enum56 = ((Field) term269622).get((Object) null);
        term269366 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term269366, term269366.getClass(), "escapeMode", null);
        setField(term269366, term269366.getClass(), "charset", null);
        setField(term269366, term269366.getClass(), "encoderThreadLocal", null);
        setField(term269366, term269366.getClass(), "coreCharset", null);
        setBooleanField(term269366, term269366.getClass(), "prettyPrint", false);
        setBooleanField(term269366, term269366.getClass(), "outline", false);
        setIntField(term269366, term269366.getClass(), "indentAmount", 0);
        setField(term269366, term269366.getClass(), "syntax", enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term268964;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term268842, args);
        assertTrue(recursiveEquals(term268842, term269363));
        assertTrue(recursiveEquals(term268964, term269366));
    }

};


