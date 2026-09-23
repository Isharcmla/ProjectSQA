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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emit_1272425389231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193237;
     Object term193369;
     Object term194752;
     Object term194762;

    public Tokeniser_emit_1272425389231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193237 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term193305 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term193237, term193237.getClass(), "isEmitPending", false);
        setField(term193237, term193237.getClass(), "emitPending", null);
        setField(term193237, term193237.getClass(), "errors", term193305);
        Class<? extends Object> term194771 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194770 = ((Class) term194771).getDeclaredField((String) "EndTag");
        ((Field) term194770).setAccessible(true);
        Object enum364 = ((Field) term194770).get((Object) null);
        LinkedHashMap term193595 = new LinkedHashMap();
        ((LinkedHashMap) term193595).put((Object)null, (Object)null);
        ((LinkedHashMap) term193595).put((Object)null, (Object)null);
        term193369 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term193535 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term193369, term193369.getClass(), "type", enum364);
        setField(term193535, term193535.getClass(), "attributes", term193595);
        setField(term193369, term193369.getClass(), "attributes", term193535);
        LinkedHashMap term194756 = new LinkedHashMap();
        Class<? extends Object> term194956 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194955 = ((Class) term194956).getDeclaredField((String) "EndTag");
        ((Field) term194955).setAccessible(true);
        Object enum365 = ((Field) term194955).get((Object) null);
        term194752 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term194753 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term194754 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194755 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194752, term194752.getClass(), "reader", null);
        setIntField(term194753, term194753.getClass(), "maxSize", 0);
        setField(term194753, term194753.getClass(), "elementData", null);
        setIntField(term194753, term194753.getClass(), "size", 0);
        setIntField(term194753, term194753.getClass(), "modCount", 0);
        setField(term194752, term194752.getClass(), "errors", term194753);
        setField(term194752, term194752.getClass(), "state", null);
        setField(term194754, term194754.getClass(), "tagName", null);
        setField(term194754, term194754.getClass(), "pendingAttributeName", null);
        setField(term194754, term194754.getClass(), "pendingAttributeValue", null);
        setBooleanField(term194754, term194754.getClass(), "selfClosing", false);
        setField(term194755, term194755.getClass(), "attributes", term194756);
        setField(term194754, term194754.getClass(), "attributes", term194755);
        setField(term194754, term194754.getClass(), "type", enum365);
        setField(term194752, term194752.getClass(), "emitPending", term194754);
        setBooleanField(term194752, term194752.getClass(), "isEmitPending", true);
        setField(term194752, term194752.getClass(), "charBuffer", null);
        setField(term194752, term194752.getClass(), "dataBuffer", null);
        setField(term194752, term194752.getClass(), "tagPending", null);
        setField(term194752, term194752.getClass(), "doctypePending", null);
        setField(term194752, term194752.getClass(), "commentPending", null);
        setField(term194752, term194752.getClass(), "lastStartTag", null);
        setBooleanField(term194752, term194752.getClass(), "selfClosingFlagAcknowledged", false);
        LinkedHashMap term194764 = new LinkedHashMap();
        Class<? extends Object> term195141 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term195140 = ((Class) term195141).getDeclaredField((String) "EndTag");
        ((Field) term195140).setAccessible(true);
        Object enum366 = ((Field) term195140).get((Object) null);
        term194762 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194763 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194762, term194762.getClass(), "tagName", null);
        setField(term194762, term194762.getClass(), "pendingAttributeName", null);
        setField(term194762, term194762.getClass(), "pendingAttributeValue", null);
        setBooleanField(term194762, term194762.getClass(), "selfClosing", false);
        setField(term194763, term194763.getClass(), "attributes", term194764);
        setField(term194762, term194762.getClass(), "attributes", term194763);
        setField(term194762, term194762.getClass(), "type", enum366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term193369;
        callMethod(klass, "emit", argTypes, term193237, args);
        assertTrue(recursiveEquals(term193237, term194752));
        assertTrue(recursiveEquals(term193369, term194762));
    }

};


