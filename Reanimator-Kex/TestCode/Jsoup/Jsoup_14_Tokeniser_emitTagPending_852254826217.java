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

public class Tokeniser_emitTagPending_852254826217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319968;
     Object term320793;

    public Tokeniser_emitTagPending_852254826217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term320803 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term320802 = ((Class) term320803).getDeclaredField((String) "EndTag");
        ((Field) term320802).setAccessible(true);
        Object enum888 = ((Field) term320802).get((Object) null);
        Object term320348 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term320258 = new LinkedHashMap();
        ((LinkedHashMap) term320258).put(term320348, term320348);
        term319968 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term320032 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term320198 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term320032, term320032.getClass(), "pendingAttributeName", null);
        setField(term320032, term320032.getClass(), "type", enum888);
        setField(term320198, term320198.getClass(), "attributes", term320258);
        setField(term320032, term320032.getClass(), "attributes", term320198);
        setField(term319968, term319968.getClass(), "tagPending", term320032);
        setBooleanField(term319968, term319968.getClass(), "isEmitPending", false);
        setField(term319968, term319968.getClass(), "emitPending", null);
        LinkedHashMap term320796 = new LinkedHashMap();
        Class<? extends Object> term320988 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term320987 = ((Class) term320988).getDeclaredField((String) "EndTag");
        ((Field) term320987).setAccessible(true);
        Object enum889 = ((Field) term320987).get((Object) null);
        term320793 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term320794 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term320795 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term320793, term320793.getClass(), "reader", null);
        setBooleanField(term320793, term320793.getClass(), "trackErrors", false);
        setField(term320793, term320793.getClass(), "errors", null);
        setField(term320793, term320793.getClass(), "state", null);
        setField(term320794, term320794.getClass(), "tagName", null);
        setField(term320794, term320794.getClass(), "pendingAttributeName", null);
        setField(term320794, term320794.getClass(), "pendingAttributeValue", null);
        setBooleanField(term320794, term320794.getClass(), "selfClosing", false);
        setField(term320795, term320795.getClass(), "attributes", term320796);
        setField(term320794, term320794.getClass(), "attributes", term320795);
        setField(term320794, term320794.getClass(), "type", enum889);
        setField(term320793, term320793.getClass(), "emitPending", term320794);
        setBooleanField(term320793, term320793.getClass(), "isEmitPending", true);
        setField(term320793, term320793.getClass(), "charBuffer", null);
        setField(term320793, term320793.getClass(), "dataBuffer", null);
        setField(term320793, term320793.getClass(), "tagPending", term320794);
        setField(term320793, term320793.getClass(), "doctypePending", null);
        setField(term320793, term320793.getClass(), "commentPending", null);
        setField(term320793, term320793.getClass(), "lastStartTag", null);
        setBooleanField(term320793, term320793.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term319968, args);
        assertTrue(recursiveEquals(term319968, term320793));
    }

};


