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

public class Tokeniser_emitTagPending_852254826255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223598;
     Object term223982;

    public Tokeniser_emitTagPending_852254826255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term223856 = new LinkedHashMap();
        term223598 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term223662 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term223796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term223662, term223662.getClass(), "pendingAttributeName", "        ");
        setField(term223662, term223662.getClass(), "pendingAttributeValue", "");
        setField(term223796, term223796.getClass(), "attributes", term223856);
        setField(term223662, term223662.getClass(), "attributes", term223796);
        setField(term223598, term223598.getClass(), "tagPending", term223662);
        LinkedHashMap term223985 = new LinkedHashMap();
        term223982 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term223983 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term223984 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term223982, term223982.getClass(), "reader", null);
        setField(term223982, term223982.getClass(), "errors", null);
        setField(term223982, term223982.getClass(), "state", null);
        setField(term223983, term223983.getClass(), "tagName", null);
        setField(term223983, term223983.getClass(), "pendingAttributeName", null);
        setField(term223983, term223983.getClass(), "pendingAttributeValue", null);
        setBooleanField(term223983, term223983.getClass(), "selfClosing", false);
        setField(term223984, term223984.getClass(), "attributes", term223985);
        setField(term223983, term223983.getClass(), "attributes", term223984);
        setField(term223983, term223983.getClass(), "type", null);
        setField(term223982, term223982.getClass(), "emitPending", term223983);
        setBooleanField(term223982, term223982.getClass(), "isEmitPending", true);
        setField(term223982, term223982.getClass(), "charBuffer", null);
        setField(term223982, term223982.getClass(), "dataBuffer", null);
        setField(term223982, term223982.getClass(), "tagPending", term223983);
        setField(term223982, term223982.getClass(), "doctypePending", null);
        setField(term223982, term223982.getClass(), "commentPending", null);
        setField(term223982, term223982.getClass(), "lastStartTag", null);
        setBooleanField(term223982, term223982.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term223598, args);
        assertTrue(recursiveEquals(term223598, term223982));
    }

};


