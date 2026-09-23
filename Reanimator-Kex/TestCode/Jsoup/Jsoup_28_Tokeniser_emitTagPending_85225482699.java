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

public class Tokeniser_emitTagPending_85225482699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104435;
     Object term105209;

    public Tokeniser_emitTagPending_85225482699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105215 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term105214 = ((Class) term105215).getDeclaredField((String) "StartTag");
        ((Field) term105214).setAccessible(true);
        Object enum291 = ((Field) term105214).get((Object) null);
        term104435 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term104503 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term104677 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term104503, term104503.getClass(), "pendingAttributeName", null);
        setField(term104503, term104503.getClass(), "type", enum291);
        setField(term104435, term104435.getClass(), "tagPending", term104503);
        setBooleanField(term104435, term104435.getClass(), "isEmitPending", false);
        setField(term104435, term104435.getClass(), "emitPending", term104677);
        Class<? extends Object> term105406 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term105405 = ((Class) term105406).getDeclaredField((String) "StartTag");
        ((Field) term105405).setAccessible(true);
        Object enum292 = ((Field) term105405).get((Object) null);
        term105209 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term105210 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term105209, term105209.getClass(), "reader", null);
        setField(term105209, term105209.getClass(), "errors", null);
        setField(term105209, term105209.getClass(), "state", null);
        setField(term105210, term105210.getClass(), "tagName", null);
        setField(term105210, term105210.getClass(), "pendingAttributeName", null);
        setField(term105210, term105210.getClass(), "pendingAttributeValue", null);
        setBooleanField(term105210, term105210.getClass(), "selfClosing", false);
        setField(term105210, term105210.getClass(), "attributes", null);
        setField(term105210, term105210.getClass(), "type", enum292);
        setField(term105209, term105209.getClass(), "emitPending", term105210);
        setBooleanField(term105209, term105209.getClass(), "isEmitPending", true);
        setField(term105209, term105209.getClass(), "charBuffer", null);
        setField(term105209, term105209.getClass(), "dataBuffer", null);
        setField(term105209, term105209.getClass(), "tagPending", term105210);
        setField(term105209, term105209.getClass(), "doctypePending", null);
        setField(term105209, term105209.getClass(), "commentPending", null);
        setField(term105209, term105209.getClass(), "lastStartTag", term105210);
        setBooleanField(term105209, term105209.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term104435, args);
        assertTrue(recursiveEquals(term104435, term105209));
    }

};


