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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251996;

    public Tokeniser_emitTagPending_852254826287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term250878 = (char[]) newCharArray(489);
        setCharElement(term250878, 0, 'E');
        setCharElement(term250878, 1, 'O');
        setCharElement(term250878, 2, 'F');
        StringBuilder term252158 = new StringBuilder();
        ((StringBuilder) term252158).append(term250878);
        Class<? extends Object> term255045 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term255044 = ((Class) term255045).getDeclaredField((String) "StartTag");
        ((Field) term255044).setAccessible(true);
        Object enum509 = ((Field) term255044).get((Object) null);
        term251996 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term252060 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term252330 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term252060, term252060.getClass(), "pendingAttributeName", "");
        setField(term252060, term252060.getClass(), "attributes", null);
        setBooleanField(term252060, term252060.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term252060, term252060.getClass(), "hasPendingAttributeValue", false);
        setField(term252060, term252060.getClass(), "pendingAttributeValue", term252158);
        setField(term252060, term252060.getClass(), "pendingAttributeValueS", null);
        setField(term252060, term252060.getClass(), "type", enum509);
        setField(term251996, term251996.getClass(), "tagPending", term252060);
        setBooleanField(term251996, term251996.getClass(), "isEmitPending", false);
        setField(term251996, term251996.getClass(), "emitPending", term252330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term251996, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


