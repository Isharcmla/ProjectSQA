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

public class Tokeniser_emitTagPending_852254826230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192323;
     Object term194614;

    public Tokeniser_emitTagPending_852254826230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192323 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term192387 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term192521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term192387, term192387.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term192387, term192387.getClass(), "pendingAttributeValue", "");
        setField(term192387, term192387.getClass(), "attributes", term192521);
        setField(term192323, term192323.getClass(), "tagPending", term192387);
        LinkedHashMap term194617 = new LinkedHashMap();
        term194614 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term194615 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term194616 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term194614, term194614.getClass(), "reader", null);
        setField(term194614, term194614.getClass(), "errors", null);
        setField(term194614, term194614.getClass(), "state", null);
        setField(term194615, term194615.getClass(), "tagName", null);
        setField(term194615, term194615.getClass(), "pendingAttributeName", null);
        setField(term194615, term194615.getClass(), "pendingAttributeValue", null);
        setBooleanField(term194615, term194615.getClass(), "selfClosing", false);
        setField(term194616, term194616.getClass(), "attributes", term194617);
        setField(term194615, term194615.getClass(), "attributes", term194616);
        setField(term194615, term194615.getClass(), "type", null);
        setField(term194614, term194614.getClass(), "emitPending", term194615);
        setBooleanField(term194614, term194614.getClass(), "isEmitPending", true);
        setField(term194614, term194614.getClass(), "charBuffer", null);
        setField(term194614, term194614.getClass(), "dataBuffer", null);
        setField(term194614, term194614.getClass(), "tagPending", term194615);
        setField(term194614, term194614.getClass(), "doctypePending", null);
        setField(term194614, term194614.getClass(), "commentPending", null);
        setField(term194614, term194614.getClass(), "lastStartTag", null);
        setBooleanField(term194614, term194614.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term192323, args);
        assertTrue(recursiveEquals(term192323, term194614));
    }

};


