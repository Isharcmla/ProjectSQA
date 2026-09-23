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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370688;

    public Tokeniser_emitTagPending_852254826393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term370521 = (char[]) newCharArray(4);
        setCharElement(term370521, 0, 'C');
        setCharElement(term370521, 1, 'o');
        setCharElement(term370521, 2, 'm');
        setCharElement(term370521, 3, 'm');
        StringBuilder term370850 = new StringBuilder();
        ((StringBuilder) term370850).append(term370521);
        Class<? extends Object> term371718 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term371717 = ((Class) term371718).getDeclaredField((String) "EndTag");
        ((Field) term371717).setAccessible(true);
        Object enum584 = ((Field) term371717).get((Object) null);
        term370688 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term370752 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term371016 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Object term371084 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term371154 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term370752, term370752.getClass(), "pendingAttributeName", "");
        setField(term370752, term370752.getClass(), "attributes", null);
        setBooleanField(term370752, term370752.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term370752, term370752.getClass(), "hasPendingAttributeValue", false);
        setField(term370752, term370752.getClass(), "pendingAttributeValue", term370850);
        setField(term370752, term370752.getClass(), "pendingAttributeValueS", null);
        setField(term370752, term370752.getClass(), "type", enum584);
        setField(term370688, term370688.getClass(), "tagPending", term370752);
        setBooleanField(term370688, term370688.getClass(), "isEmitPending", false);
        setField(term370688, term370688.getClass(), "emitPending", term371016);
        setIntField(term371084, term371084.getClass(), "maxSize", 2147483647);
        setField(term370688, term370688.getClass(), "errors", term371084);
        setField(term370688, term370688.getClass(), "reader", term371154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term370688, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


