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
import java.lang.StringBuilder;

public class Tokeniser_emitTagPending_852254826309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269218;
     Object term269581;

    public Tokeniser_emitTagPending_852254826309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term269438 = new StringBuilder();
        term269218 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term269282 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term269378 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term269282, term269282.getClass(), "pendingAttributeName", "");
        setField(term269282, term269282.getClass(), "attributes", term269378);
        setBooleanField(term269282, term269282.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term269282, term269282.getClass(), "hasPendingAttributeValue", false);
        setField(term269282, term269282.getClass(), "pendingAttributeValue", term269438);
        setField(term269218, term269218.getClass(), "tagPending", term269282);
        term269581 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term269582 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term269583 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term269584 = (byte[]) newByteArray(16);
        Object term269585 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term269581, term269581.getClass(), "reader", null);
        setField(term269581, term269581.getClass(), "errors", null);
        setField(term269581, term269581.getClass(), "state", null);
        setField(term269582, term269582.getClass(), "tagName", null);
        setField(term269582, term269582.getClass(), "normalName", null);
        setField(term269582, term269582.getClass(), "pendingAttributeName", null);
        setField(term269583, term269583.getClass(), "value", term269584);
        setByteField(term269583, term269583.getClass(), "coder", (byte) 0);
        setIntField(term269583, term269583.getClass(), "count", 0);
        setField(term269582, term269582.getClass(), "pendingAttributeValue", term269583);
        setField(term269582, term269582.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term269582, term269582.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term269582, term269582.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term269582, term269582.getClass(), "selfClosing", false);
        setField(term269585, term269585.getClass(), "attributes", null);
        setField(term269582, term269582.getClass(), "attributes", term269585);
        setField(term269582, term269582.getClass(), "type", null);
        setField(term269581, term269581.getClass(), "emitPending", term269582);
        setBooleanField(term269581, term269581.getClass(), "isEmitPending", true);
        setField(term269581, term269581.getClass(), "charsString", null);
        setField(term269581, term269581.getClass(), "charsBuilder", null);
        setField(term269581, term269581.getClass(), "dataBuffer", null);
        setField(term269581, term269581.getClass(), "tagPending", term269582);
        setField(term269581, term269581.getClass(), "startPending", null);
        setField(term269581, term269581.getClass(), "endPending", null);
        setField(term269581, term269581.getClass(), "charPending", null);
        setField(term269581, term269581.getClass(), "doctypePending", null);
        setField(term269581, term269581.getClass(), "commentPending", null);
        setField(term269581, term269581.getClass(), "lastStartTag", null);
        setBooleanField(term269581, term269581.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term269581, term269581.getClass(), "codepointHolder", null);
        setField(term269581, term269581.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term269218, args);
        assertTrue(recursiveEquals(term269218, term269581));
    }

};


