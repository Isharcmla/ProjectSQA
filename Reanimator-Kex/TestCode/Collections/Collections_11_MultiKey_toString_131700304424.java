package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_toString_131700304424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term782;

    public MultiKey_toString_131700304424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term58 = (Object[]) newArray("java.lang.Object", 6);
        Object term59 = newInstance(Class.forName("java.lang.Object"));
        Object term60 = newInstance(Class.forName("java.lang.Object"));
        Object term61 = newInstance(Class.forName("java.lang.Object"));
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        setElement(term58, 0, term59);
        setElement(term58, 1, term60);
        setElement(term58, 2, term61);
        setElement(term58, 3, term62);
        setElement(term58, 4, term63);
        setElement(term58, 5, term64);
        setField(term57, term57.getClass(), "keys", term58);
        term782 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term783 = (Object[]) newArray("java.lang.Object", 6);
        Object term784 = newInstance(Class.forName("java.lang.Object"));
        Object term785 = newInstance(Class.forName("java.lang.Object"));
        Object term786 = newInstance(Class.forName("java.lang.Object"));
        Object term787 = newInstance(Class.forName("java.lang.Object"));
        Object term788 = newInstance(Class.forName("java.lang.Object"));
        Object term789 = newInstance(Class.forName("java.lang.Object"));
        setElement(term783, 0, term784);
        setElement(term783, 1, term785);
        setElement(term783, 2, term786);
        setElement(term783, 3, term787);
        setElement(term783, 4, term788);
        setElement(term783, 5, term789);
        setField(term782, term782.getClass(), "keys", term783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term782));
        assertTrue(recursiveEquals(retValue, "MultiKey[java.lang.Object@368a9406, java.lang.Object@2bef15c3, java.lang.Object@35dc7d8b, java.lang.Object@631da7ba, java.lang.Object@1d5357b, java.lang.Object@5247798f]"));
    }

};


