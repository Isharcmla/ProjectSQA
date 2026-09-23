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

public class Tokeniser_emitTagPending_852254826235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217440;
     Object term217663;

    public Tokeniser_emitTagPending_852254826235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217440 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term217504 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term217600 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term217504, term217504.getClass(), "pendingAttributeName", "");
        setField(term217504, term217504.getClass(), "attributes", term217600);
        setField(term217440, term217440.getClass(), "tagPending", term217504);
        term217663 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term217664 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term217665 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term217663, term217663.getClass(), "reader", null);
        setField(term217663, term217663.getClass(), "errors", null);
        setField(term217663, term217663.getClass(), "state", null);
        setField(term217664, term217664.getClass(), "tagName", null);
        setField(term217664, term217664.getClass(), "normalName", null);
        setField(term217664, term217664.getClass(), "pendingAttributeName", null);
        setField(term217664, term217664.getClass(), "pendingAttributeValue", null);
        setField(term217664, term217664.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term217664, term217664.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term217664, term217664.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term217664, term217664.getClass(), "selfClosing", false);
        setField(term217665, term217665.getClass(), "attributes", null);
        setField(term217664, term217664.getClass(), "attributes", term217665);
        setField(term217664, term217664.getClass(), "type", null);
        setField(term217663, term217663.getClass(), "emitPending", term217664);
        setBooleanField(term217663, term217663.getClass(), "isEmitPending", true);
        setField(term217663, term217663.getClass(), "charsString", null);
        setField(term217663, term217663.getClass(), "charsBuilder", null);
        setField(term217663, term217663.getClass(), "dataBuffer", null);
        setField(term217663, term217663.getClass(), "tagPending", term217664);
        setField(term217663, term217663.getClass(), "startPending", null);
        setField(term217663, term217663.getClass(), "endPending", null);
        setField(term217663, term217663.getClass(), "charPending", null);
        setField(term217663, term217663.getClass(), "doctypePending", null);
        setField(term217663, term217663.getClass(), "commentPending", null);
        setField(term217663, term217663.getClass(), "lastStartTag", null);
        setBooleanField(term217663, term217663.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term217663, term217663.getClass(), "codepointHolder", null);
        setField(term217663, term217663.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term217440, args);
        assertTrue(recursiveEquals(term217440, term217663));
    }

};


