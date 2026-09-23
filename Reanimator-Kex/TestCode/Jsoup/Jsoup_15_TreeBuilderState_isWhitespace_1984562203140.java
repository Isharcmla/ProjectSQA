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
import java.lang.String;
import java.lang.Object;

public class TreeBuilderState_isWhitespace_1984562203140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2729143;

    public TreeBuilderState_isWhitespace_1984562203140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2729291 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term2729290 = ((Class) term2729291).getDeclaredField((String) "Character");
        ((Field) term2729290).setAccessible(true);
        Object enum297 = ((Field) term2729290).get((Object) null);
        term2729143 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term2729143, term2729143.getClass(), "type", enum297);
        setField(term2729143, term2729143.getClass(), "data", "\n\n\n\t \t\t\n\n\n\n\t\t\n\t\t\n\n\n\t\n\n\n\t\n    \t\n\n\n\n\n\n\t\n\t\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\n\t\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term2729143;
        callMethod(klass, "isWhitespace", argTypes, null, args);
    }

};


