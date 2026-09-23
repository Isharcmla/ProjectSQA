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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195971;
     Object term197279;

    public Tokeniser_emitTagPending_852254826233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term196191 = new LinkedHashMap();
        term195971 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term196035 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term196131 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term196035, term196035.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term196035, term196035.getClass(), "pendingAttributeValue", null);
        setField(term196131, term196131.getClass(), "attributes", term196191);
        setField(term196035, term196035.getClass(), "attributes", term196131);
        setField(term195971, term195971.getClass(), "tagPending", term196035);
        LinkedHashMap term197282 = new LinkedHashMap();
        term197279 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term197280 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term197281 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term197279, term197279.getClass(), "reader", null);
        setField(term197279, term197279.getClass(), "errors", null);
        setField(term197279, term197279.getClass(), "state", null);
        setField(term197280, term197280.getClass(), "tagName", null);
        setField(term197280, term197280.getClass(), "pendingAttributeName", null);
        setField(term197280, term197280.getClass(), "pendingAttributeValue", null);
        setBooleanField(term197280, term197280.getClass(), "selfClosing", false);
        setField(term197281, term197281.getClass(), "attributes", term197282);
        setField(term197280, term197280.getClass(), "attributes", term197281);
        setField(term197280, term197280.getClass(), "type", null);
        setField(term197279, term197279.getClass(), "emitPending", term197280);
        setBooleanField(term197279, term197279.getClass(), "isEmitPending", true);
        setField(term197279, term197279.getClass(), "charBuffer", null);
        setField(term197279, term197279.getClass(), "dataBuffer", null);
        setField(term197279, term197279.getClass(), "tagPending", term197280);
        setField(term197279, term197279.getClass(), "doctypePending", null);
        setField(term197279, term197279.getClass(), "commentPending", null);
        setField(term197279, term197279.getClass(), "lastStartTag", null);
        setBooleanField(term197279, term197279.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term195971, args);
        assertTrue(recursiveEquals(term195971, term197279));
    }

};


