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

public class Attribute_shouldCollapseAttribute_77820687897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152432;
     Object term152592;
     Object term153151;
     Object term153156;

    public Attribute_shouldCollapseAttribute_77820687897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152432 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term152432, term152432.getClass(), "key", "");
        setField(term152432, term152432.getClass(), "val", "");
        Class<? extends Object> term153161 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term153160 = ((Class) term153161).getDeclaredField((String) "xml");
        ((Field) term153160).setAccessible(true);
        Object enum49 = ((Field) term153160).get((Object) null);
        term152592 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term152592, term152592.getClass(), "syntax", enum49);
        term153151 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term153151, term153151.getClass(), "key", "");
        setField(term153151, term153151.getClass(), "val", "");
        setField(term153151, term153151.getClass(), "parent", null);
        Class<? extends Object> term153407 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term153406 = ((Class) term153407).getDeclaredField((String) "html");
        ((Field) term153406).setAccessible(true);
        Object enum50 = ((Field) term153406).get((Object) null);
        term153156 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term153156, term153156.getClass(), "escapeMode", null);
        setField(term153156, term153156.getClass(), "charset", null);
        setField(term153156, term153156.getClass(), "encoderThreadLocal", null);
        setField(term153156, term153156.getClass(), "coreCharset", null);
        setBooleanField(term153156, term153156.getClass(), "prettyPrint", false);
        setBooleanField(term153156, term153156.getClass(), "outline", false);
        setIntField(term153156, term153156.getClass(), "indentAmount", 0);
        setField(term153156, term153156.getClass(), "syntax", enum50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term152592;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term152432, args);
        assertTrue(recursiveEquals(term152432, term153151));
        assertTrue(recursiveEquals(term152592, term153156));
    }

};


