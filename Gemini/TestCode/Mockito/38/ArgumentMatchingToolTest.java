package org.mockito.internal.verification.argumentmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ArgumentMatchingToolTest {

    private ArgumentMatchingTool tool;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_sizeMismatch_returnsEmptyArray() {
        List<Matcher> matchers = Collections.<Matcher>singletonList(new DummyMatcher("a"));
        Object[] arguments = new Object[]{"a", "b"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_emptyInputs_returnsEmptyArray() {
        List<Matcher> matchers = Collections.emptyList();
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_matcherNotContainsExtraTypeInformation_returnsEmptyArray() {
        Matcher matcher = new DummyMatcher("test");
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{"other"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_matcherSafelyMatches_returnsEmptyArray() {
        Matcher matcher = new ExtraInfoMatcher(true, false, "100", false);
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{"100"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_toStringDiffers_returnsEmptyArray() {
        Matcher matcher = new ExtraInfoMatcher(false, false, "expectedString", false);
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{"actualString"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_typeMatchesReturnsTrue_returnsEmptyArray() {
        Matcher matcher = new ExtraInfoMatcher(false, true, "sameString", false);
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{"sameString"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[0], result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_suspiciousArgumentDetected_returnsIndex() {
        Matcher matcher = new ExtraInfoMatcher(false, false, "10", false);
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{10L};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[]{0}, result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_matcherThrowsExceptionInMatches_handledSafelyAndFoundSuspicious() {
        Matcher matcher = new ExtraInfoMatcher(false, false, "errorCase", true);
        List<Matcher> matchers = Collections.singletonList(matcher);
        Object[] arguments = new Object[]{"errorCase"};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[]{0}, result);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_multipleArguments_returnsOnlySuspiciousIndexes() {
        List<Matcher> matchers = Arrays.<Matcher>asList(
                new ExtraInfoMatcher(false, false, "10", false),  // Index 0: Suspicious
                new ExtraInfoMatcher(true, true, "20", false),    // Index 1: Matches
                new DummyMatcher("30"),                          // Index 2: Not extra type info
                new ExtraInfoMatcher(false, false, "40", false),  // Index 3: Suspicious
                new ExtraInfoMatcher(false, true, "50", false)    // Index 4: Type matches
        );
        Object[] arguments = new Object[]{10L, 20, "30", 40L, 50};

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        Assert.assertArrayEquals(new Integer[]{0, 3}, result);
    }

    private static class DummyMatcher extends BaseMatcher<Object> {
        private final String description;

        public DummyMatcher(String description) {
            this.description = description;
        }

        @Override
        public boolean matches(Object item) {
            return false;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(this.description);
        }
    }

    private static class ExtraInfoMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final boolean matches;
        private final boolean typeMatches;
        private final String description;
        private final boolean throwException;

        public ExtraInfoMatcher(boolean matches, boolean typeMatches, String description, boolean throwException) {
            this.matches = matches;
            this.typeMatches = typeMatches;
            this.description = description;
            this.throwException = throwException;
        }

        @Override
        public boolean matches(Object item) {
            if (throwException) {
                throw new RuntimeException("Simulated exception during matching");
            }
            return matches;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(this.description);
        }

        @Override
        public boolean typeMatches(Object target) {
            return typeMatches;
        }
    }
}
