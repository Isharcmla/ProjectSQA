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

public class Tokeniser_emitTagPending_852254826105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102249;
     Object term102363;

    public Tokeniser_emitTagPending_852254826105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102249 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term102313 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term102249, term102249.getClass(), "tagPending", term102313);
        term102363 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term102364 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term102363, term102363.getClass(), "reader", null);
        setField(term102363, term102363.getClass(), "errors", null);
        setField(term102363, term102363.getClass(), "state", null);
        setField(term102364, term102364.getClass(), "tagName", null);
        setField(term102364, term102364.getClass(), "pendingAttributeName", null);
        setField(term102364, term102364.getClass(), "pendingAttributeValue", null);
        setBooleanField(term102364, term102364.getClass(), "selfClosing", false);
        setField(term102364, term102364.getClass(), "attributes", null);
        setField(term102364, term102364.getClass(), "type", null);
        setField(term102363, term102363.getClass(), "emitPending", term102364);
        setBooleanField(term102363, term102363.getClass(), "isEmitPending", true);
        setField(term102363, term102363.getClass(), "charBuffer", null);
        setField(term102363, term102363.getClass(), "dataBuffer", null);
        setField(term102363, term102363.getClass(), "tagPending", term102364);
        setField(term102363, term102363.getClass(), "doctypePending", null);
        setField(term102363, term102363.getClass(), "commentPending", null);
        setField(term102363, term102363.getClass(), "lastStartTag", null);
        setBooleanField(term102363, term102363.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term102249, args);
        assertTrue(recursiveEquals(term102249, term102363));
    }

};


