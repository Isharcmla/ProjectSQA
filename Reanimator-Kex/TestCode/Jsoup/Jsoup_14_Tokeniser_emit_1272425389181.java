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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267998;
     Object term268062;
     Object term269449;
     Object term269455;

    public Tokeniser_emit_1272425389181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267998 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term267998, term267998.getClass(), "isEmitPending", false);
        setField(term267998, term267998.getClass(), "emitPending", null);
        Class<? extends Object> term269461 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term269460 = ((Class) term269461).getDeclaredField((String) "EndTag");
        ((Field) term269460).setAccessible(true);
        Object enum837 = ((Field) term269460).get((Object) null);
        term268062 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term268228 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term268062, term268062.getClass(), "type", enum837);
        setField(term268062, term268062.getClass(), "attributes", term268228);
        Class<? extends Object> term269646 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term269645 = ((Class) term269646).getDeclaredField((String) "EndTag");
        ((Field) term269645).setAccessible(true);
        Object enum838 = ((Field) term269645).get((Object) null);
        term269449 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term269450 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term269451 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term269449, term269449.getClass(), "reader", null);
        setBooleanField(term269449, term269449.getClass(), "trackErrors", false);
        setField(term269449, term269449.getClass(), "errors", null);
        setField(term269449, term269449.getClass(), "state", null);
        setField(term269450, term269450.getClass(), "tagName", null);
        setField(term269450, term269450.getClass(), "pendingAttributeName", null);
        setField(term269450, term269450.getClass(), "pendingAttributeValue", null);
        setBooleanField(term269450, term269450.getClass(), "selfClosing", false);
        setField(term269451, term269451.getClass(), "attributes", null);
        setField(term269450, term269450.getClass(), "attributes", term269451);
        setField(term269450, term269450.getClass(), "type", enum838);
        setField(term269449, term269449.getClass(), "emitPending", term269450);
        setBooleanField(term269449, term269449.getClass(), "isEmitPending", true);
        setField(term269449, term269449.getClass(), "charBuffer", null);
        setField(term269449, term269449.getClass(), "dataBuffer", null);
        setField(term269449, term269449.getClass(), "tagPending", null);
        setField(term269449, term269449.getClass(), "doctypePending", null);
        setField(term269449, term269449.getClass(), "commentPending", null);
        setField(term269449, term269449.getClass(), "lastStartTag", null);
        setBooleanField(term269449, term269449.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term269831 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term269830 = ((Class) term269831).getDeclaredField((String) "EndTag");
        ((Field) term269830).setAccessible(true);
        Object enum839 = ((Field) term269830).get((Object) null);
        term269455 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term269456 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term269455, term269455.getClass(), "tagName", null);
        setField(term269455, term269455.getClass(), "pendingAttributeName", null);
        setField(term269455, term269455.getClass(), "pendingAttributeValue", null);
        setBooleanField(term269455, term269455.getClass(), "selfClosing", false);
        setField(term269456, term269456.getClass(), "attributes", null);
        setField(term269455, term269455.getClass(), "attributes", term269456);
        setField(term269455, term269455.getClass(), "type", enum839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term268062;
        callMethod(klass, "emit", argTypes, term267998, args);
        assertTrue(recursiveEquals(term267998, term269449));
        assertTrue(recursiveEquals(term268062, term269455));
    }

};


